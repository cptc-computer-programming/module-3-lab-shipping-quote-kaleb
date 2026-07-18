# Shipping Quote Calculator

## Cost Formula

Write your cost formula (math or pseudocode). It must include:
- at least one weight-based factor
- at least one size-based factor

```java 
// finalCost = baseCost + totalWeight
    //  + 2(lw + lh + wh) -- size factor
```


Brief justification (2–4 sentences):
I decided to choose surface area as my size factor choice because I would assume when storing packages 
you should be wary about the other packages around it. Specifically, figuring out the surface area of all packages surrounding should be most optimal as to plan around fitting all packages in.
---

## Method List

For each method, keep it short. Include only:
- description (1 sentence)
- inputs (short list)
- output (what it returns)
- return type

Use at least 5 methods.

**Method 1**:
- description: package info, volume, size factor, and final shipping cost.
- inputs: weight, length, width, height, volume, size factor, and shipping cost.
- output: shipping quote shown on console.
- return type: void

**Method 2**:
- description: find volume
- inputs: length, width, height
- output: volume
- return type: double

**Method 3**:
- description: find weight cost
- inputs: weight
- output: weight cost
- return type: double

**Method 4**:
- description: method for finding surface area
- inputs: length width height
- output: surface area of package
- return type: double

**Method 5**:
- description: method for finding total price
- inputs: weight cost + surface area cost + volume cost
- output: total shipping
- return type: double
