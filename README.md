# MyMarketingApp
My Marketing App is a personal Android application designed to help users create and preview personalized marketing messages for job applications. The app collects user input such as contact details, job title, availability, and other preferences, then generates a formatted message preview. Users can send the message directly via SMS from within the app.

## Programming Languages / Technologies
Kotlin, Android SDK, Intents, Serializable data class, Material Design Components, View Binding (Kotlin synthetic)

## Features

- ### User Input Form
Allows entering contact name, contact number, user display name, job title selection (spinner), junior status, immediate start checkbox, and start date.

- ### Message Data Handling
Uses a serializable Message data class to bundle input data and pass it between activities efficiently.

- ### Message Preview
Displays a formatted preview of the marketing message including dynamic text based on user inputs like job description and availability.

- ### SMS Intent Integration
Enables users to send the generated message directly through the device’s SMS app by launching an intent with the message prefilled.
