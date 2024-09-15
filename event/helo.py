import hashlib
import itertools
import string
import time

# The given hash
target_hash = "829dd145ed07f9a46e52aacd549b0ea0"

# All possible characters (alphanumeric)
characters = string.ascii_letters + string.digits

def find_original_code():
    start_time = time.time()
    count = 0
    for candidate in itertools.product(characters, repeat=5):
        count += 1
        # Join the characters to form the string
        candidate_str = ''.join(candidate)
        # Hash the string using MD5
        candidate_hash = hashlib.md5(candidate_str.encode()).hexdigest()
        # Check if it matches the target hash
        if candidate_hash == target_hash:
            end_time = time.time()
            print(f"Combinations tested: {count}")
            print(f"Time taken: {end_time - start_time:.2f} seconds")
            return candidate_str
        # Print progress every million combinations
        if count % 1000000 == 0:
            print(f"Tested {count} combinations...")
    return None

print("Starting brute-force attack...")
original_code = find_original_code()

if original_code:
    print(f"Original message: {original_code}")
else:
    print("Original message not found using brute-force.")