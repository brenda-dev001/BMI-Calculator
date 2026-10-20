# 📱 BMI Calculator

An Android application developed as part of my Kotlin studies, with a focus on strengthening my knowledge of **Jetpack Compose**, building user interfaces, managing UI states, and implementing calculation logic.

The main goal of this project was to practice creating Android applications using Kotlin and Jetpack Compose.

## ✨ Features

- Calculate Body Mass Index (BMI) based on height and weight.
- Classify BMI results into different weight categories.
- Display BMI results formatted to two decimal places.
- Validate required input fields.
- Provide visual feedback for empty fields.
- Support decimal values for weight.
- Update the interface dynamically using Jetpack Compose state management.

## 🛠️ Technologies Used

\<p align="center">
&#x20; \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/kotlin/kotlin-original.svg)" width="40" height="40" alt="Kotlin" title="Kotlin" />
&#x20; &nbsp;
&#x20; \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jetpackcompose/jetpackcompose-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/jetpackcompose/jetpackcompose-original.svg)" width="40" height="40" alt="Jetpack Compose" title="Jetpack Compose" />
&#x20; &nbsp;
&#x20; \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/androidstudio/androidstudio-original.svg)" width="40" height="40" alt="Android Studio" title="Android Studio" />
&#x20; &nbsp;
&#x20; \<img src="[https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg](https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/gradle/gradle-original.svg)" width="40" height="40" alt="Gradle" title="Gradle" />
\</p>

## ⚙️ How It Works

The application allows users to enter their height in centimeters and weight in kilograms.

The BMI is calculated using the following formula:

**BMI = Weight (kg) / Height (m)²**

The calculation logic is implemented in the `Calculations` object, separating it from the user interface.

The application uses **callback functions** to communicate calculation results and validation states to the interface.

Jetpack Compose manages UI updates through `remember` and `mutableStateOf`, automatically updating the displayed result when the corresponding states change.

## 📁 Project Structure

```text
BMI_CALCULATOR/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/imc_calculator/
│           │   ├── datasource/
│           │   │   └── Calculations.kt
│           │   ├── ui/
│           │   │   └── theme/
│           │   │       ├── Color.kt
│           │   │       ├── Theme.kt
│           │   │       └── Type.kt
│           │   ├── view/
│           │   │   └── Home.kt
│           │   └── MainActivity.kt
│           ├── res/
│           └── AndroidManifest.xml
├── build.gradle.kts
├── settings.gradle.kts
└── gradle.properties
```

## 🚀 Running the Project

1. Install Android Studio.
2. Clone the repository to your computer.
3. Open the project in Android Studio.
4. Wait for Gradle synchronization to complete.
5. Run the application using an Android emulator or a physical Android device.
6. Enter your height and weight to calculate your BMI.

## 📌 Project Status

Project developed for educational purposes, focusing on practicing and consolidating Kotlin and Jetpack Compose concepts, including UI development, state management, input handling, and callback functions.

## 👩‍💻 Author

Developed by [Brenda](https://github.com/brenda-dev001) as part of my Android development studies.
