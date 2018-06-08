# RerunnableThread
RunnableThread abstract class can handle each multithread's state, which is whether "waiting" or "re-running". Its state is manipulated by RunnableThread instance boolean variable 'flag'. This class inherits Thread class.  
The `waitOnce()` method causes thread's state "waiting" and the `rerun()` method "re-running".

## Constructors
|   | Constructors | Description |
|:-:| :--- | :--- |
| 1 | RerunnableThread(Boolean flag) | This constructor creates thread in specified state. When thread is running, true is cannot be "waiting" but false is can be "waiting". |
| 2 | RerunnableThread() | This constructor creates thread in default state. Then flag is false. |

## Methods
|   | Methods | Description |
|:-:| :--- | :--- |
| 1 | public void waitOnce() | Causes the current thread to wait when flag is false. |
| 2 | public void rerun() | Wakes up the specified thread when that thread is "waiting". |
| 3 | public Boolean getFlag() | Returns the value of flag. |
| 4 | protected void setTrue() | Causes flag to be true. `setFalse()` method causes it to be false. |

## How to Use
MultiThreaded class which is 'ThreadDemo' class in sample program needs to inherit *RunnableThread* class.
