import 'dart:async';
import 'dart:convert';
import 'package:flutter_trip/model/search_model.dart';
import 'package:http/http.dart' as http;

class SearchDao {

  static Future<SearchModel> fetch(String str, String text) async {
    final response = await http.get(str);
    if(response.statusCode == 200) {
      if(response.bodyBytes.length > 0) {
        Utf8Decoder utf8decoder = Utf8Decoder();
        var result = json.decode(utf8decoder.convert(response.bodyBytes));
        SearchModel model = SearchModel.fromJson(result);
        model.keyword = text;
        return model;
      } else {
        return null;
      }
    } else {
      throw Exception('Faild to load search_model.json');
    }
  }
}