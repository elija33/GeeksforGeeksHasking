# GeeksforGeeksHasking
Geeks for Geeks  data structures Hashing

#           Applications of Hashing

Dictionarics
Databas Indexing
Cryptography
Caches
Symbol tables in compilers or interpreters. 
Routers
Getting data from databases


        How hash functions works
Should always map a large key to same small key
Should generate values from 0 to m - 1 (m is the size of the hash table)
Should be fast, 0(1) for integer and 0(length) for string of length.
Should uniformly distribute large keys into hash table slots

             Collision Handling
IF we know keys in advance, then we can perfect hashing
if we do not know keys, then we use chaining and open addressing

                Chaining


                Chaining Performance
m = number of slots in hash table
n = number of keys to be inserted
load factor = n / m
Expected chain length = 
Expected Time to search = 0(1)
Expected Time to Insert adn delete is 0(1)

        Data Structures for storing Chaining Hash

Linked list
    which Searching, Delete and Insert are O(lenght).
    Is not cash friendly, because nodes are at different locations.
    It uses extra space for storing next references

Dynamic sized Arrays
    which Searching, Delete and Insert are O(lenght).
    Id cash friendly.

Self Balancing (BST)
    which Searching, Delete and Insert are O(log l).
    Is not cash friendly.