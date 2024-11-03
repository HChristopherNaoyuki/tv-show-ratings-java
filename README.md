# TVShowRatings

## Overview
TVShowRatings is a Java application designed to calculate and display average ratings for popular TV shows. It provides a user-friendly interface to show whether each series should continue based on viewer ratings.

## Features
- Stores TV show names and their respective ratings in a structured format.
- Calculates average ratings for each show.
- Determines if a show should continue based on average ratings (≥ 7).
- Includes error handling for robustness.

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/tv-show-ratings-java.git
   ```
2. Navigate to the project directory:
   ```bash
   cd TVShowRatings
   ```
3. Compile the Java program:
   ```bash
   javac TVShowRatings.java
   ```
4. Run the program:
   ```bash
   java TVShowRatings
   ```

## Usage
When the program is run, it will display a formatted table with the following columns:
- TV Show
- Average Rating
- Series Continuation (Yes/No)

## Example Output
```
TV SHOW              RATING     SERIES CONTINUATION
---------------------------------------------------
Big Bang Theory      7         Yes       
Scandal              6         No        
Modern Family        8         Yes       
Dexter               8         Yes       
Grand Designs        3         No        
```

---
