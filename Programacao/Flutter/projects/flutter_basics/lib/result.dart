import 'package:flutter/material.dart';

class Result extends StatelessWidget {
  final int finalScore;
  final Function reset;

  Result(this.finalScore, this.reset);

  @override
  Widget build(BuildContext context) {
    return Center(
        child: Column(
          children: <Widget>[
            Text('Total Score: $finalScore',
                style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold)),
                FlatButton(child: Text('Restart'), onPressed: reset,)
          ],
        ));
  }
}
