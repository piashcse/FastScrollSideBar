# FastScroll SideBar
![badge-Android](https://img.shields.io/badge/Platform-Android-brightgreen)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
[![Kotlin](https://img.shields.io/badge/Kotlin-1.8.20-blue.svg?style=flat&logo=kotlin)](https://kotlinlang.org)
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)
<a href="https://github.com/piashcse"><img alt="License" src="https://img.shields.io/static/v1?label=GitHub&message=piashcse&color=C51162"/></a>
<p align="center" width="100%">
  <img width="30%" height="40%" src="https://github.com/piashcse/FastScrollSideBar/blob/master/screenshoots/fastscroll.gif" />

</p>

### Step 1. Add the JitPack repository to your build file

```
repositories {
    ...
    maven { url 'https://jitpack.io' }
}
```

### Step 2. Add the dependency in your app build.gradle

```
dependencies {
    ...
    implementation 'com.github.piashcse:FastScrollSideBar:1.0.0'
}
```
### Step 3. Add SideBarView with your recyclerView
```
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerview"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintBottom_toBottomOf="parent"/>

    <com.piashcse.fastcrollsidebar.SideBarView
        android:id="@+id/side_bar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:hintTextSize="30sp"
        app:hintShape="rectangleWithCornerRadius"/>
</androidx.constraintlayout.widget.ConstraintLayout>
```
## 👨 Developed By

<a href="https://twitter.com/piashcse" target="_blank">
  <img src="https://avatars.githubusercontent.com/piashcse" width="80" align="left">
</a>

**Mehedi Hassan Piash**

[![Twitter](https://img.shields.io/badge/-twitter-grey?logo=twitter)](https://twitter.com/piashcse)
[![Web](https://img.shields.io/badge/-web-grey?logo=appveyor)](https://piashcse.github.io/)
[![Medium](https://img.shields.io/badge/-medium-grey?logo=medium)](https://medium.com/@piashcse)
[![Linkedin](https://img.shields.io/badge/-linkedin-grey?logo=linkedin)](https://www.linkedin.com/in/piashcse/)


# License
```
Copyright 2023 piashcse (Mehedi Hassan Piash)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

