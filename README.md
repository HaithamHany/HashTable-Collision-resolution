# Hash Table Collision Resolution Strategies

This repository is a comprehensive Java implementation of hash tables demonstrating three fundamental collision resolution strategies: separate chaining, linear probing, and double hashing.

## Overview

A hash table is an efficient data structure for storing and retrieving values with a key. However, collisions — situations where multiple keys map to the same index — can occur. This repository explores how these collisions can be resolved using different techniques.

## Collision Resolution Techniques

- **Separate Chaining**: This technique handles collisions by maintaining a list of all elements that hash to the same index. Each slot in the hash table is a linked list, and all entries with the same hash index are stored in the list at that slot.

- **Linear Probing**: A form of open addressing where, upon a collision, the hash table checks the next slot in the sequence until an empty slot is found. This method is simple but can lead to clustering which may impact performance.

- **Double Hashing**: This method uses a secondary hash function to define the step size for probing. It reduces clustering and covers all slots, ensuring that if the table has space, the item can be inserted.

## Implementation Details

- **Hash Functions**: We implement modular hash functions with appropriate constants to match the size of the hash table and ensure a good distribution of values.
  
- **Handling Collisions**: 
  - For separate chaining, each slot starts as an empty list.
  - For linear probing and double hashing, a probing sequence is initiated upon collision to find the next available slot.

## Usage

This implementation can serve as a foundation for understanding and experimenting with different collision resolution strategies in hash tables.
