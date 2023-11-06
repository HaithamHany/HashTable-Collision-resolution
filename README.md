# Double Hashing Hash Table

This repository contains a Java implementation of a hash table that resolves collisions using double hashing. Double hashing is a collision resolution technique in hash tables that uses a secondary hash function to calculate a new index when a collision occurs.

## Overview

The hash table has a fixed size of 8 slots, and the primary hash function is defined as `h1(k) = k % 8`. To handle collisions, we implement a secondary hash function `h2(k) = 7 - (k % 7)`. Double hashing offers a significant advantage in that the probe sequence is calculated in such a way that all slots are visited, which minimizes clustering and reduces the likelihood of secondary collision.

## Implementation Details

- **Hash Functions**: We use two hash functions. The primary hash function determines the initial slot, and the secondary hash function provides an offset for subsequent probes.
- **Insertion Process**: When an insert operation is initiated, the primary hash function is first used to determine the slot index. If a collision is detected, the secondary hash function calculates the offset, and we continue to probe the table until an empty slot is found.
- **Collision Handling**: The double hashing mechanism ensures that every slot in the table is probed before any index is revisited, which is essential for maximizing the use of the available space.


