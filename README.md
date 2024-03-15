# MyWishlistApp2

MyWishlistApp2 is a simple Android application developed using Kotlin and Jetpack Compose framework. It allows users to create, view, update, and delete their wishlist items. The app utilizes Room database for data persistence and follows MVVM architecture pattern.

## Features
- **Add Wishlist Item**: Users can add a new wishlist item with a title and description.
- **View Wishlist**: Users can view all their wishlist items.
- **Edit Wishlist Item**: Users can update existing wishlist items.
- **Delete Wishlist Item**: Users can delete wishlist items they no longer want.

## Screenshots

<!-- Include screenshots or GIFs of your app here to give users a visual representation of what your app looks like. -->
<img src="https://github.com/nishkarsh25/MyWishListApp2/blob/main/Screenshots/ss1.png" alt="Screenshot 1" width="300"> &nbsp; &nbsp; <img src="https://github.com/nishkarsh25/MyWishListApp2/blob/main/Screenshots/ss2.png" alt="Screenshot 2" width="300">

<img src="https://github.com/nishkarsh25/MyWishListApp2/blob/main/Screenshots/ss3.png" alt="Screenshot 4" width="300">


# GIF's
<img src="https://github.com/nishkarsh25/MyWishListApp2/blob/main/Screenshots/ss4.gif" alt="Screenshot 4" width="300">

## Architecture
The app follows the MVVM (Model-View-ViewModel) architecture pattern, which separates the concerns of data, UI, and business logic. Here's how each component fits into the architecture:

- **Model**: Represents the data and business logic of the application. This includes the `Wish` data class, `WishDao` interface for database operations, `WishDatabase` class representing the Room database, and `WishRepository` class handling data operations.

- **View**: Represents the UI of the application. It consists of Jetpack Compose components responsible for rendering the user interface. Screens such as the Home screen (displaying wishlist items) and Add/Edit screen (for adding or updating wishlist items) are part of the View layer.

- **ViewModel**: Acts as a bridge between the Model and the View. It holds UI-related data and exposes methods for interacting with the data. The `WishViewModel` class manages the state of the UI components and handles user interactions.

## Components
- **Wish**: Data class representing a single wishlist item with attributes such as `id`, `title`, and `description`.
- **WishDao**: Data Access Object interface defining methods for performing database operations like insert, update, delete, and query.
- **WishDatabase**: Room database class responsible for creating and managing the database instance.
- **WishRepository**: Repository class that abstracts data access from the ViewModel. It provides a clean API for ViewModel to interact with the data source.
- **WishViewModel**: ViewModel class responsible for managing UI-related data and business logic. It communicates with the repository to perform data operations and updates the UI accordingly.
- **Navigation**: Jetpack Navigation Compose is used for handling navigation between different screens of the app.

## Dependencies
- **Kotlin Coroutines**: Used for asynchronous programming to perform database and network operations.
- **Jetpack Compose**: Declarative UI toolkit for building native Android UIs.
- **Room Persistence Library**: Provides an abstraction layer over SQLite to perform database operations.
- **Jetpack Navigation Compose**: Handles navigation within the app using a type-safe API.

## Installation

To run the MyWishlistApp2 project locally, follow these steps:

### Prerequisites

- Android Studio installed on your machine.
- An Android emulator or a physical Android device for testing.

### Clone the Repository

1. Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/nishkarsh25/MyWishListApp2.git
```

## Open in Android Studio

1. Open Android Studio.
2. Click on "Open an existing Android Studio project."
3. Navigate to the directory where you cloned the repository and select the "MyWishlistApp" folder.
4. Click "OK" to open the project.

## Build and Run

1. Connect your Android device to your computer, or start an Android emulator.
2. Click on the "Run" button in Android Studio or use the shortcut Shift + F10 to build and run the project.
3. Select your device from the list of available devices and click "OK."

## Usage

1. Upon launching the app, you'll be presented with the wishlist screen.
2. To add a new item to the wishlist, click on the floating action button (FAB) at the bottom right corner.
3. Fill in the details for the new item and click the "Add" button.
4. To update an existing item, click on the item in the wishlist.
5. Make the necessary changes and click the "Save" button.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these steps:

1. **Fork the Repository**.
2. **Create a New Branch** (`git checkout -b feature/your-feature-name`).
3. **Make Your Changes**.
4. **Commit Your Changes** (`git commit -am 'Add some feature'`).
5. **Push to the Branch** (`git push origin feature/your-feature-name`).
6. **Create a New Pull Request**.

## License

This project is licensed under the [The 3-Clause BSD License](LICENSE).

## Author

- **Nishkarsh Gupta**
  - GitHub: [nishkarsh25](https://github.com/nishkash25)
  - Email: bm21btech11016@gmail.com
