package com.example.imc_calculator.datasource

object Calculations {

    fun calculateImc(height: String, weight: String, response: (String, Boolean) -> Unit){

        if(height.isNotEmpty() && weight.isNotEmpty()){

            val heightFormatted = height.toDoubleOrNull()
            val weightFormatted = weight.replace(",", ".").toDoubleOrNull()

            if(heightFormatted != null && weightFormatted != null){
                val bmi = weightFormatted / (heightFormatted/ 100 * heightFormatted/ 100)
                val bmiFormatted = String.format("%.2f", bmi)

                when{
                    bmi < 18.5 -> response("BMI: $bmiFormatted \n Underweight", false)
                    bmi in 18.5..24.9 -> response("BMI: $bmiFormatted \n Normal weight", false)
                    bmi in 25.0..29.9 -> response("BMI: $bmiFormatted \n Overweight", false)
                    bmi in 30.0..34.9 -> response("BMI: $bmiFormatted \n Obesity (Grade 1)", false)
                    bmi in 35.0..39.9 -> response("BMI: $bmiFormatted \n Severe obesity (Grade 2)", false)
                    else -> response("BMI: $bmiFormatted \n Morbid obesity (Grade 3)", false)
                }

            }
        }else{
            response("Fill in all the fields!", true)
        }
    }
}