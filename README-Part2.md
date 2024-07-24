# Number to LCD

## Part 2

Change your program to support variable `width` or `height` of the lines of the digits. For example with `width = 3` and `height = 2` the digit `2` will be:

```
 ___
    |
 ___|
|    
|___
```

Where the sizes are for the ASCII representation of the *lines*. So "width" of 3 means the "underscore dash" is represented by 3 underscore dashes:

```
___
```

And the "height" of 2 represents the vertical line:

```
|
|
```

The final size of the LCD-digit with width `x` and height `y` should be (`2+x`, `1+2y`).
The actual size of this example is 5 x 5.

## Examples

### Width 4, Height 1

```
 ____ 
 ____|
|____ 
```

Size: 6 x 3

### Width 2, Height 3

```
 __ 
   |
   |
 __|
|   
|   
|__ 
```

Size: 4 x 7

## Simplification

In the representation above, the vertical and horizontal lines may join in the same line with combinations such as `|_`, `_|` or `|_|`. If you prefer,
you may
change the representation so that vertical and horizontal never met. Like his example:

```
 ___
    |
    |
 ___
|
|
 ___
```

### Notes

If you choose this implementation:

- The calculation of the size changes to (`2+x`, `3+2y`)
- This would also change the representation of the digits from Part 1, which will make a digit with width 1 and height 1 occupy 5 lines:

```
 _
  |
 _
| 
 _
```
