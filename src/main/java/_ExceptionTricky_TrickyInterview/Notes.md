| Throws | Catch | Result |
|---|---|---|
| `IOException` | `Exception` | ✅ Valid — widening |
| `IOException` | `IOException` | ✅ Valid — same |
| `Exception` | `IOException` | ❌ Invalid — narrowing | 
| `Exception` | `Throwable` | ✅ Valid — widening |


