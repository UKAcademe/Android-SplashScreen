# Android Splash Screen
**Material Android Splash Screen**

<img src="app/src/main/res/drawable/logo.png" align="left"
width="100"
    hspace="10" vspace="10">

Android Splash Screen is the first screen visible to the user when the application’s launched. Splash screen is one of the most vital screens in the application since it’s the user’s first experience with the application.

Splash screens are used to display some animations (typically of the application logo) and illustrations while some data for the next screens are fetched.

## Preview
<img src="/screenshots/sabith_pkc_mnr_github_repo_splash_screen_intro.webp">

## Implementation
Now the timer is based on `postDelayed()` public method. This method will help us to queue a process to a certain period of time that we set for the method and app will perform that task after that time period.

First we set the time for the timer using a very simple `int SPLASH_TIME` variable
```groovy
int SPLASH_TIME = 3000; //This is 3 seconds
```

```groovy
new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                Intent mySuperIntent = new Intent(ActivitySplash.this, ActivityHome.class);
                startActivity(mySuperIntent);

                //This 'finish()' is for exiting the app when back button pressed from Home page which is ActivityHome
                finish();

            }
        }, SPLASH_TIME);
```


## Video Tutorial
You can also watch the complete tutorial video from my very on YouTube channel here:<br>
[![Click to watch tutorial video](https://img.youtube.com/vi/jXtof6OUtcE/0.jpg)](https://www.youtube.com/watch?v=jXtof6OUtcE)
<br><br>
<h4>Hey, while you're here why don't you think of following me for awesome projects like this, ah? <a href="https://github.com/SabithPkcMnr">Follow Me on my Profile!</a></h4>

<br>
Now grab a cup of hot or cold coffee☕ and let's get started. Feel free to give a star, fork and play around the ads.

This app make it easy for you to implement Splash screen very easily into your Android App. You can also take a look at how we used to  implement the [Facebook Mobile Ads](https://github.com/SabithPkcMnr/FacebookAds/ "Yoo my boi click to open this page").
