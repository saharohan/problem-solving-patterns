# Group Anagrams

Group strings that contain the same characters into the same collection.

## 📌 Key Idea

Convert each word into a normalized form by sorting its characters.

Words that produce the same sorted value belong to the same anagram group.

Example:

```txt id="m4xt4d"
eat → aet
tea → aet
ate → aet
```

Since the sorted result is the same, they are grouped together.

## 📌 Why this approach

Instead of comparing every string with every other string, use a `HashMap` to group words by a common key.

Sorting creates a consistent representation of an anagram, while the map enables fast grouping.

## 📌 Pattern

Arrays & Hashing → Grouping using HashMap

## 📌 Real-world application

Useful when data needs to be grouped based on a normalized representation.

Examples:

* grouping duplicate or equivalent values
* organizing records with reordered content
* clustering similar identifiers or tokens

## 📌 Complexity

* Time: `O(n × k log k)`
  (`n` = number of words, `k` = average word length)

* Space: `O(n × k)`


