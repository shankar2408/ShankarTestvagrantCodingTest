# Shankar TestVagrant Coding Test
# Song Playlist

Coding Assignment:
OVERVIEW
Create an in-memory store for recently played songs that can accommodate N songs per user, with a fixed initial capacity. This store must have the capability to store a list of song-user pairs, with each song linked to a user. It should also be able to fetch recently played songs based on the user and eliminate the least recently played songs when the store becomes full.

EXAMPLE
Illustration, when 4 different songs were played by a user & Initial capacity is 3: 
Let's assume that the user has played 3 songs - S1, S2 and S3.
The playlist would look like -> S1,S2,S3
When S4 song is played -> S2,S3,S4 
When S2 song is played -> S3,S4,S2 
When S1 song is played -> S4,S2,S1

## Overview

src/main/java/testVagrant includes two classes:
- `SongPlaylist`: Represents the implementation of the problem statement. It has add song based on intial capacity, get recently played songs lists method. 
- `SongPlaylistTest`: Contains TestNG tests to verify the code functionality of the `SongPlaylist` class code with different test data.

## Steps to run this code

1. Clone or download the repository.
2. Import it in eclipse or intelliji or any IDE using existing maven project
3. Add TestNG library
4. Run the SongPlaylistTest class using testNG

