# FaisalCrush

A damn easy way to crash your app

Imagine you are at a hackathon and you are building the best app among competition (or you think).  
Now one of the other teams is constantly trying to peek at your awesome app and you are frustrated with it.  
You think of a way to solve this problem.  
Faisal comes to rescue.  

Presenting `Faisal- The ultimate app crasher`

Faisal makes your app crash. So next time other team members comes looking for your app, Just add this one line
  ```java
  Faisal.getInstance().crush();
  ```
  and Faisal will crush your app. Whoa! You can show to other teams that your app is still crashing and is not ready yet.
  
  Faisal gives you full control on how you want your app to be crashed. 
  Use `FaisalBuilder` to build your out of the box crash.
  
  With Faisal, you can set the type of crash (Exception or an error or one of faisal's special crush method).
  You can set the specific error or exception you want to be thrown and you can add your own stack trace elements so that 
  you have control over what is displayed in the stacktrace.
  
  ```java
  FaisalBuilder builder = new FaisalBuilder();
        //set crush type (Exception or Error)
        builder.setCrushType(Faisal.CrushType.EXCEPTION);
        //set exception (runtime exceptions only)
        builder.setException(new NullPointerException());
        //set error
        builder.setError(new AbstractMethodError());
        //add stack trace elements
        builder.addStackTraceLement("MainActivity","onCreate","MainActivity.java",4);
        builder.addStackTraceLement("MainActivity","onCreate","MainActivity.java",14);
        builder.addStackTraceLement("MainActivity","onCreate","MainActivity.java",25);
        //crush it!
  builder.build().crush();
  ```
  (Wanted to do something funny in free time and this is totally a useless thing and do not take this seriously)
