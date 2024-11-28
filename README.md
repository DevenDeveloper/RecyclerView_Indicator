# RecyclerView Indicator Library

The **RecyclerView Indicator Library** is a customizable and lightweight library for adding indicators to your RecyclerView. Indicators help improve navigation and user experience, particularly in carousels or horizontally scrolling lists. This library integrates seamlessly with RecyclerViews and supports dynamic configurations.

---

## Preview

![RecyclerView Indicator Demo](https://github.com/DevenDeveloper/RecyclerView_Indicator/raw/main/preview.gif)

---

## Features

- **Easy Integration**: Quickly add indicators to your RecyclerView.
- **Customizable**: Adjust colors, sizes, and styles to match your app's theme.
- **Dynamic Behavior**: Indicators automatically update based on scroll state.
- **Lightweight**: Minimal performance impact on your app.

---

## How to Install

### Step 1: Add the JitPack Repository
Add the JitPack repository in your project-level `build.gradle` file:

```gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Step 2: Add the Dependency
Include the library in your app-level `build.gradle` file:

```gradle
dependencies {
    implementation 'com.github.DevenDeveloper:RecyclerView_Indicator:1.0.0'
}
```

---

## Usage

### Step 1: Set Up RecyclerView
Create a `RecyclerView` with a horizontal layout:

```kotlin
val images: MutableList<ModelImages> = ArrayList()
// Add your image data
images.add(ModelImages(1, "Title", "ImageURL"))

// Set up layout manager
val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
recyclerView.layoutManager = layoutManager

// Set up adapter
val adapter = ImageAdapter(this, images)
recyclerView.adapter = adapter
```

### Step 2: Add Indicator
Attach the indicator to your `RecyclerView`:

```kotlin
val indicator = RecyclerViewIndicator(this)
indicator.attachToRecyclerView(recyclerView)
indicator.setIndicatorColor(activeColor = Color.RED, inactiveColor = Color.GRAY)
```

---

## Customization

### Indicator Colors
You can customize the active and inactive colors:

```kotlin
indicator.setIndicatorColor(activeColor = Color.GREEN, inactiveColor = Color.LIGHT_GRAY)
```

### Indicator Size
Set the size of the indicators:

```kotlin
indicator.setIndicatorSize(activeSize = 12, inactiveSize = 8)
```

### Spacing
Adjust spacing between indicators:

```kotlin
indicator.setIndicatorSpacing(16)
```

---

## Example Code
```kotlin
val images: MutableList<ModelImages> = ArrayList()
// Populate your data
images.add(ModelImages(1, "", "https://example.com/image1.jpg"))
images.add(ModelImages(2, "", "https://example.com/image2.jpg"))

// Set up RecyclerView
val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
recyclerView.layoutManager = layoutManager
recyclerView.adapter = ImageAdapter(this, images)

// Add Indicator
val indicator = RecyclerViewIndicator(this)
indicator.attachToRecyclerView(recyclerView)
indicator.setIndicatorColor(activeColor = Color.BLUE, inactiveColor = Color.LIGHT_GRAY)
indicator.setIndicatorSize(activeSize = 14, inactiveSize = 10)
indicator.setIndicatorSpacing(12)
```

---

## License
This library is distributed under the [MIT License](https://opensource.org/licenses/MIT).

---

## Contributing
Contributions are welcome! Feel free to fork the repository, create issues, or submit pull requests. For major changes, please open an issue to discuss your ideas first.

---

## Author
Developed by [DevenDeveloper](https://github.com/DevenDeveloper). If you find this library useful, consider starring the repository! 😊
