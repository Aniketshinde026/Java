

//Run
import java.util.*;
class hw_two{

public static void main(String[] args){
    for(; ;) {
            System.out.println("Apna College");
        }
}

}

/*Running this infinite loop:

```java
for (;;) {
    System.out.println("Apna College");
}
```

will **print the string "Apna College" repeatedly without stopping** until you manually terminate the program.

---

### Why does this happen?

* The `for` loop syntax is:

  ```java
  for (initialization; condition; update) {
      // loop body
  }
  ```

* In `for(;;)`, **all three parts are omitted**:

  * No initialization,
  * No condition (which defaults to `true`),
  * No update step.

* This means the loop has **no stopping condition** and will run **forever**, continuously printing `"Apna College"`.

---

### What happens on your system?

* The program will keep printing `"Apna College"` line after line as fast as your system allows.
* It can cause:

  * High CPU usage,
  * Your console may get flooded,
  * You may need to **manually stop the program** (e.g., Ctrl+C in terminal or stop button in IDE).

---

### Summary:

* `for(;;)` creates an **infinite loop**.
* Useful in some scenarios where you want continuous processing (like servers, daemons).
* Must always have some `break` or exit condition inside the loop to stop it eventually, or external interruption.

---

If you want, I can show you how to safely control or break such an infinite loop!
*/
