Results for the Software Interview Problems
===

# Problem - 1

- C++ Docker Image

```
Fixed issue in the Dockerfile:
1. The Makefile was looking for src/test.cpp, but the file was copied to the wrong location in the Docker container.
2. Fixed by adjusting the Makefile to look for test.cpp in the current directory instead of in a src subdirectory.
```

-  Python Docker Image

```
Fixed issue in the Python implementation:
1. The LRU Cache implementation in lru.py had incomplete refer() method.
2. Implemented the proper LRU cache functionality to handle cache misses and reference updates.
```

- Java Docker Image

```
Fixed multiple issues in the Java image:
1. Added missing HashSet import in LRUCache.java.
2. Implemented the missing refer() method in LRUCache.java.
3. Fixed the CMD syntax in Dockerfile to use proper array format.
4. Updated pom.xml to include Java 8 as source/target and set the main class in the manifest.
```

# Problem - 2

- C++ Build

```
Fixed build issues in the Makefile:
1. The Makefile was looking for src/test.cpp, but after copying files in the Docker container, the path was incorrect.
2. Modified the Makefile to look for test.cpp in the current directory.
```

- Java Build

```
Fixed several build issues:
1. Added missing jdk.version property in pom.xml.
2. Added maven.compiler.source and maven.compiler.target properties to use Java 8.
3. Configured the maven-jar-plugin to properly set the Main-Class attribute in the manifest.
```

- Python Run

```
Fixed the incomplete LRU Cache implementation in lru.py:
1. Implemented the refer() method to handle cache misses and updates.
2. Ensured the least recently used items are properly tracked and evicted when the cache is full.
```

# Problem - 3

- C++ Docker Run Output

```
$ docker run lru-cache-cpp
5 4 1 3
```

- Java Docker Run Output

```
$ docker run lru-cache-java
5 4 1 3
```

- Python Docker Run Output

```
$ docker run lru-cache-python
5 4 1 3
```