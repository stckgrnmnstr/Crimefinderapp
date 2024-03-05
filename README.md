# Crimefinderapp
Associates quantized point values like names locations and descriptions of criminal activity 
import os

# Step 1: Define criminal activities
criminal_activities = ["robbery", "assault", "vandalism", "accessory", "fraud"]

# Step 2: Gather descriptions (fake example)
descriptions = {
    "robbery": "A robbery occurred at a convenience store last night. The perpetrator demanded money at gunpoint.",
    "assault": "There was a brutal assault reported in the downtown area. The victim suffered severe injuries after being attacked with a blunt object.",
    "vandalism": "Several cars were vandalized in the parking lot. The vandals spray-painted graffiti on the vehicles and smashed their windows.",
    "accessory": "An individual was arrested for being an accessory to the robbery. They aided the perpetrator in escaping the scene.",
    "fraud": "A case of fraud was uncovered involving forged documents and financial deception."
}

# Step 3: Collect quantized longitude and latitude for locations and associate descriptions
location_coordinates = {
    "New York City": {"latitude": 40.7128, "longitude": -74.0060},
    "Los Angeles": {"latitude": 34.0522, "longitude": -118.2437},
    "London": {"latitude": 51.5074, "longitude": -0.1278},
    "Tokyo": {"latitude": 35.6895, "longitude": 139.6917},
    "Sydney": {"latitude": -33.8688, "longitude": 151.2093}
}

correlated_data = []

for location, coordinates in location_coordinates.items():
    for activity in criminal_activities:
        correlated_data.append((location, coordinates["latitude"], coordinates["longitude"], descriptions[activity], activity))

# Step 4: Print correlated data
for location, latitude, longitude, description, activity in correlated_data:
    print(f"Location: {location}, Latitude: {latitude}, Longitude: {longitude}, Description: {description}, Activity: {activity}")

# Additional functionality: correlate words with locations
word_library = {
    "robbery": ["theft", "crime", "money", "masked", "gunpoint"],
    "assault": ["violence", "attack", "injury", "victim", "brutal"],
    "vandalism": ["damage", "destruction", "graffiti", "vandals", "smashed"],
    "accessory": ["aiding", "abetting", "accomplice", "arrested", "suspect"],
    "fraud": ["forgery", "deception", "financial", "scam", "counterfeit"]
}

correlated_data_word = []

for location, coordinates in location_coordinates.items():
    for activity, words in word_library.items():
        for word in words:
            correlated_data_word.append((location, coordinates["latitude"], coordinates["longitude"], f"An image related to {activity} depicting {word}.", activity))

# Print correlated data based on words
for location, latitude, longitude, description, activity in correlated_data_word:
    print(f"Word Location: {location}, Latitude: {latitude}, Longitude: {longitude}, Description: {description}, Activity: {activity}")
