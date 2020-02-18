# breathe-air-android

⚠️This project is "under construction" and has no working functionalities.

We will use Android Architecture components during the process. 
More information about app architecture: [Guide to app architecture](https://developer.android.com/jetpack/docs/guide)

We will also be using toolset provided by the Android KTX which is included in the Jetpack

#### Repository
Currently, the Repository only fetches the data form the server to provide it to the ViewModel.
The Repository will be updated to support data persistence using Room.
After updating this, the ViewModel would not need any changes regarding this.

#### Current Situation
Right now, we finished a basic API connection to the backend.
The main fragment uses its ViewModel to get the data and prints a debug log with the name of the station in LogCat.
Currently the Lat and Lang of the German city of Cologne are hardcoded for testing and will be updated after UI preparation is done.     

### More comes as the project evolves.
