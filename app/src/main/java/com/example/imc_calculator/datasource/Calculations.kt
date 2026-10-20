package com.example.imc_calculator.datasource

object Calculations {

    fun calculateImc(height: String, weight: String, response: (String, Boolean) -> Unit){

        if(height.isNotEmpty() && weight.isNotEmpty()){

            val heightFormatted = height.toDoubleOrNull()
            val weightFormatted = weight.replace(",", ".").toDoubleOrNull()

            if(heightFormatted != null && weightFormatted != null){
                val imc = weightFormatted / (heightFormatted/ 100 * heightFormatted/ 100)
                val imcFormatted = String.format("%.2f", imc)

                when{
                    imc < 18.5 -> response("IMC: $imcFormatted \n Underweight", false)
                    imc in 18.5..24.9 -> response("IMC: $imcFormatted \n Normal weight", false)
                    imc in 25.0..29.9 -> response("IMC: $imcFormatted \n Overweight", false)
                    imc in 30.0..34.9 -> response("IMC: $imcFormatted \n Obesity (Grade 1)", false)
                    imc in 35.0..39.9 -> response("IMC: $imcFormatted \n Severe obesity (Grade 2)", false)
                    else -> response("IMC: $imcFormatted \n Morbid obesity (Grade 3)", false)
                }

            }
        }else{
            response("Fill in all the fields!", true)
        }
    }
}