Android Splash Screen

Android Splash Screen is the first screen visible to the user when the application’s launched. Splash screen is one of the most vital screens in the application since it’s the user’s first experience with the application.

Splash screens are used to display some animations (typically of the application logo) and illustrations while some data for the next screens are fetched.

```java
public class SplashActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        ...
        
        new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(this, MainActivity.class));
                    }
                }, 3000); //fu***ng 3s delay
    }
}
```
