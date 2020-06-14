import 'package:flutter/material.dart';

class Answer extends StatelessWidget {
  final String _text;
  final Function _callback;

  Answer(this._text, this._callback);

  @override
  Widget build(BuildContext context) {
    return Container(
      width: double.infinity,
      child: RaisedButton(
        color: Colors.blue,
        textColor: Colors.white,
        child: Text(this._text),
        onPressed: this._callback,
      ),
    );
  }
}
