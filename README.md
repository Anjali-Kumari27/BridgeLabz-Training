# BridgeLabz-Training
## Week 5: Collection Framework

### Day 27: Fundamentals of Java Generics 
**Date:** 16-Jan-2026

1. Created and organized the `java-collections-practice` branch for structured Java Collections.
2. Set up a clean project structure to separate practice areas.

### Project Structure
```BridgeLabz-Training/
│── java-collections-practice/
│ 	│── gcr-codebase/
|   |   └── CollectionsPractice/
|   |       └── src/
|   |           └── com/
|   |               │── generics/
|   |               │── variousinterfaces/
|   |                  └──│── listinterface/
|   |               │     │── setinterface/
|   |               │     │── queueinterface/
|   |               │     │── mapinterface/
|   |               │     │── additionalquestion/
|   |               └── streams/
|   |               └── exceptionhandling/
|   |
│ 	└── scenario-based-codebase/
└── README.md
```

3. Studied the basics of **Java Generics**.
4. Learned Java Generics for type-safe and reusable collection handling.
5. Understood Type Parameters (T, E, K, V) and their role in APIs.
6. Implemented Generic Classes and Generic Methods.
7. Used Bounded Types (extends, super) to restrict and control types.
8. Applied Wildcards (?, ? extends, ? super) for flexible collections.
9. Followed Generics best practices (no raw types, safe bounds, readable design)

🔗 *Code Link*
[Day 27 : Java Generics](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/generics)



### Day 28: Java Collection Framework 
**Date:** 17-Jan-2026
1. Studied Java Collections Framework architecture and hierarchy.
2. Understood the role of Collection and Map interfaces.
3. Learned List Interface and its implementations:
 - ArrayList
 - LinkedList
 - Vector
4. Performed common List operations:
- `Add`, `remove`, `update`, `search`
5. Iteration using for-each, Iterator, and ListIterator
6. Learned Set Interface and its implementations:
 - HashSet
 - LinkedHashSet
 - TreeSet
7. Understood uniqueness, ordering, and sorting behavior in Sets.
8. Learned Map Interface and its implementations:
 - HashMap
 - LinkedHashMap
 - TreeMap
9. Performed key-value operations:
 - Insertion, deletion, retrieval
10. Iteration using entrySet(), keySet(), and values()
11. Learned Queue Interface and its implementations:
 - PriorityQueue
 - ArrayDeque
12. Studied queue operations:
 - Enqueue, dequeue, peek & poll
13. Understood FIFO behavior and priority-based processing.
14. Understood internal working, use cases, and performance considerations.
15. Practiced real-time examples for List, Set, Queue and Map.
16. Committed and pushed all work.

🔗 *Code Link*
[Day 28 : Fundamentals Of Java Collections](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/variousinterfaces)



## Week 6: Practicing and Learning about Java Collection Framework

### Day 29: Java Streams
**Date:** 19-Jan-2026

1. Studied Java I/O Streams architecture and stream-based data handling.
2. Covered Byte Streams and Character Streams for file operations.
3. Learned and implemented:
- `FileInputStream`, `FileOutputStream`
- `FileReader`, `FileWriter`
- `BufferedInputStream`, `BufferedOutputStream`
- `BufferedReader`, `BufferedWriter`
4. Understood Object Streams:
- `ObjectInputStream`, `ObjectOutputStream`
- `Serialization` and `deserialization`
5. Practiced in-memory streams:
- `ByteArrayInputStream`, `ByteArrayOutputStream`
6. Used bridge streams:
- `InputStreamReader`, `OutputStreamWriter`
7. Applied try-with-resources, buffering, and performance best practices.
8. Solved practical problems including `file copy`, `serialization`, and efficient large-file reading.
9. Committed and pushed all work.

🔗 *Code Link*
[Day 29 : Java Streams](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/streams)



### Day 30: Exception Handling
**Date:** 20-Jan-2026

1. Studied Java exception handling and exception hierarchy.
2. Differentiated between checked and unchecked exceptions.
3. Implemented `try`, `catch`, `finally`, and multiple catch blocks.
4. Practiced handling common runtime exceptions.
5. Used nested `try-catch` for granular error handling.
6. Applied `throw` and `throws` for `exception` creation and propagation.
7. Designed and implemented custom exceptions for business rules.
8. Used try-with-resources for automatic resource management.
9. Solved scenario-based exception handling problems.
10. Committed and pushed all work.

🔗 *Code Link*
[Day 30 : Exception Handling](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/exceptionhandling)


### Day 31: Regex & JUnit Testing
**Date:** 21-Jan-2026

1. Studied Java Regular Expressions and java.util.regex API.
2. Worked with Pattern and Matcher classes.
3. Practiced regex metacharacters and quantifiers.
4. Implemented validations for:
- Email addresses
- Password strength
- Phone numbers
5. Used regex operations:
- find(), matches(), replaceAll()
6. Extracted structured data:
7. Dates, hashtags, domain names
8. Learned JUnit fundamentals and testing lifecycle.
9. Used JUnit 5 annotations:
- `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`
10. Implemented:
- Parameterized tests and repeated tests
- Exception testing using `assertThrows`
11. Applied assertion APIs:
- `assertEquals`, `assertTrue`, `assertAll`
12. Followed Arrange-Act-Assert (AAA) testing pattern.
13. Created structured test classes and automated test execution.
14. Committed and pushed all work.

🔗 *Code Link*
[Day 31: Regex](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/regex)
[Day 31: JUnit](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/junit)



### Day 32: Annotations & Reflection
**Date:** 22-Jan-2026

1. Studied Java annotations and their practical usage.
2. Implemented standard annotations:
   - `@Override`, `@Deprecated`, `@SuppressWarnings`
3. Created custom annotations with attributes and defaults.
4. Built repeatable annotations using `@Repeatable`.
5. Retrieved annotation metadata at runtime using Reflection API.
6. Implemented field and method validation using annotations.
7. Simulated role-based access control with custom annotations.
8. Built annotation-driven utilities:
  - `JSON mapping`
9. Caching mechanisms
10. Practiced Java Reflection fundamentals:
  - `Inspecting classes`, `fields`, `methods`, and `constructors`
11. Dynamic object creation and method invocation
12. Accessed private and static members using Reflection.
13. Implemented advanced Reflection use cases:
  - `Execution-time logging`
  - `JSON generation`
14. Dependency injection simulation
15. Solved scenario-based problems and committed work.

🔗 *Code Link*
[Day 32: Annotations](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/annotations)
[Day 32: Reflection](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/gcr-codebase/CollectionsPractice/src/com/reflection)



### Day 33: Scenario-Based Practice
**Date:** 23-Jan-2026

1. Solved 5 scenario-based problems.
   - ResumeAnalyzer – Smart Resume Filtering System
   - TravelLog – Trip Organizer for Backpackers
   - FeedbackGuru – Smart Survey Analyzer
   - CodeRepoCleaner – Java File Scanner and Organizer
   - ExamScanner – Digital Answer Sheet Validator
3. Focused on logical thinking and real-world problem solving.
4. Committed and pushed all solutions.

🔗 *Code Link*
[Day 33: Scenario-based problems](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/scenario-based/ScenarioBasedQuestions)


### Day 34: Scenario-Based Practice
**Date:** 24-Jan-2026

1. Solved 5 scenario-based problems.
   - MedInventory – Smart Hospital Inventory Tracker
   - ChatLogParser – Messaging Pattern Analyzer
   - SongVault – Personal Music Library Manager
   - ExamResultUploader – Bulk Marks Processing
   - DealTracker – E-Commerce Discount Validator
3. Focused on logical thinking and real-world problem solving.
4. Committed and pushed all solutions.

🔗 *Code Link*
[Day 34: Scenario-based problems](https://github.com/Anjali-Kumari27/BridgeLabz-Training/tree/java-collections-practice/java-collections-practice/scenario-based/ScenarioBasedQuestions)
