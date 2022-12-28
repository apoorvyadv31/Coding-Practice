import RSA
import random
import math

class RSA:
    
    def __init__(self):
        self.message = "Apoorv Yadav 20BCY10130"
        self.p = 0
        self.q = 0
        self.n = 0
        self.phi = 0
        self.e = 0
        self.d = 0
        self.public_key = []
        self.private_key = []
        self.encrypted_message = []
        self.decrypted_message = []
    
    def generate_keys(self):
        
        self.p = self.generate_prime()
        self.q = self.generate_prime()
        self.n = self.p * self.q
        self.phi = (self.p - 1) * (self.q - 1)
        self.e = self.generate_e()
        self.d = self.generate_d()
        self.public_key = [self.e, self.n]
        self.private_key = [self.d, self.n]
    
    def generate_prime(self):
        while True:
            num = random.randint(100, 1000)
            if self.is_prime(num):
                return num
    
    def is_prime(self, num):
        if num % 2 == 0:
            return False
        for i in range(3, int(math.sqrt(num)) + 1, 2):
            if num % i == 0:
                return False
        return True
    
    def generate_e(self):
        while True:
            e = random.randint(2, self.phi)
            if self.is_coprime(e, self.phi):
                return e
    
    def is_coprime(self, num1, num2):
        return math.gcd(num1, num2) == 1

    def generate_d(self):
        d = self.mod_inverse(self.e, self.phi)
        return d
    
    def mod_inverse(self, a, m):
        for x in range(1, m):
            if (a * x) % m == 1:
                return x
    
    def encrypt_message(self):
        message_num = self.convert_to_numbers(self.message)
        for num in message_num:
            self.encrypted_message.append(self.encrypt(num, self.public_key))
    
    def convert_to_numbers(self, message):
        message_num = []
        for char in message:
            message_num.append(ord(char))
        return message_num
    
    def encrypt(self, num, public_key):
        return (num ** public_key[0]) % public_key[1]
    
    def decrypt_message(self):
        
        for num in self.encrypted_message:
            self.decrypted_message.append(self.decrypt(num, self.private_key))
    
    def decrypt(self, num, private_key):
        return (num ** private_key[0]) % private_key[1]
    
    def convert_to_message(self, message_num):
        message = ""
        for num in message_num:
            message += chr(num)
        return message
    
    def print_keys(self):
        print("RSA public key: ", self.public_key)
        print("RSA private key: ", self.private_key)
    
    def print_encrypted_message(self):
        print("Encrypted message: ", self.encrypted_message)
    
    def print_decrypted_message(self):
        print("Decrypted message: ", self.decrypted_message)
    
    def print_original_message(self):
        print("Original message: ", self.message)
    
    
    def main(self):
        print("Message: ", self.message)
        self.generate_keys()
        self.print_keys()
        self.encrypt_message()
        self.print_encrypted_message()
        self.decrypt_message()
        self.print_decrypted_message()
        self.decrypted_message = self.convert_to_message(self.decrypted_message)
        self.print_original_message()

if __name__ == "__main__":
    rsa = RSA()
    rsa.main()