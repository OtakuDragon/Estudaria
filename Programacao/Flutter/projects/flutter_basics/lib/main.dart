import 'package:flutter/material.dart';
import 'package:flutter_basics/answer.dart';
import 'package:flutter_basics/question.dart';
import 'package:flutter_basics/quiz.dart';
import 'package:flutter_basics/result.dart';

void main() => runApp(App());

class App extends StatefulWidget{
  @override
  State<StatefulWidget> createState() {
    return _AppState();
  }
} 

class _AppState extends State<App>{
  var questionIndex = 0;
  var totalScore = 0;
  final questions = const [
      {'question': 'What\'s your favorite color?', 'answers': [{'text':'Red', 'score': 10}, {'text':'White', 'score': 5}, {'text':'Blue', 'score': 50}, {'text':'Yellow', 'score': 1}]},
      {'question': 'What\'s your favorite animal?', 'answers': [{'text':'Moose', 'score': 10}, {'text':'Racoon', 'score': 100}, {'text':'Giraffe', 'score': 5}, {'text':'Monkey', 'score': 1000}]}
    ];

  void reset(){
    setState(() {
      questionIndex = 0;
      totalScore = 0;
    });
  }

  void changeQuestion(int score){
    setState(() {
      totalScore += score;
      questionIndex++;
    });
  }

  @override
  Widget build(BuildContext context) {

    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          title: Text('My App'),
        ),
        body: questionIndex < questions.length ?
         Quiz(questions[questionIndex], changeQuestion) :
         Result(totalScore, reset),
      ),
    );
  }
}
