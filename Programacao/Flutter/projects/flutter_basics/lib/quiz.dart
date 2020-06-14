import 'package:flutter/material.dart';
import 'package:flutter_basics/question.dart';

import 'answer.dart';

class Quiz extends StatelessWidget {
  final Map<String, Object> question;
  final Function callback;

  Quiz(this.question, this.callback);

  @override
  Widget build(BuildContext context) {
    return Column(
      children: <Widget>[
        Question(this.question['question']),
        ...(this.question['answers'] as List)
            .map((answer) => Answer(answer['text'], () => callback(answer['score']))),
      ],
    );
  }
}
