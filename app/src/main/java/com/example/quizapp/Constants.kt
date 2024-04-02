package com.example.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"


    fun getQuestions() : ArrayList<Questions>{
        val questionList = ArrayList<Questions>()

        val que1 = Questions(
            1,
            "What Country does this flag belong to?",
            R.drawable.japan,
            "Japan",
            "Korea",
            "South Korea",
            "Indonesia",
            1
        )
        val que2 = Questions(
            2,
            "What Country does this flag belong to?",
            R.drawable.phillipines,
            "Mongolia",
            "Indonesia",
            "Phillipines",
            "Australia",
            3
        )
        val que3 = Questions(
            3,
            "What Country does this flag belong to?",
            R.drawable.ireland,
            "Mongolia",
            "India",
            "Ireland",
            "Mexico",
            3
        )
        val que4 = Questions(
            2,
            "What Country does this flag belong to?",
            R.drawable.vietnam,
            "Columbia",
            "Tanzania",
            "Mexico",
            "Vietnam",
            4
        )
        val que5 = Questions(
            2,
            "What Country does this flag belong to?",
            R.drawable.newzealand,
            "New Zealand",
            "Guinea",
            "Morocco",
            "Australia",
            1
        )


        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)

        return questionList
    }
}