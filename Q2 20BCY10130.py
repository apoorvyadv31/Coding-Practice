from Cryptodome.Cipher import AES
import secrets
from binascii import unhexlify

def generate_key_iv(key_length=16, iv_length=16):
    key = secrets.token_bytes(key_length)
    iv = secrets.token_bytes(iv_length)
    return key, iv

def encrypt_message(message, key, iv):
 
    pad_length = 16 - (len(message) % 16)
    message = message + b' ' * pad_length

    
    cipher = AES.new(key, AES.MODE_CBC, iv)
    encrypted_message = cipher.encrypt(message)

    return encrypted_message

def decrypt_message(encrypted_message, key, iv):
    
   
    cipher = AES.new(key, AES.MODE_CBC, iv)
    decrypted_message = cipher.decrypt(encrypted_message)

    decrypted_message = decrypted_message.rstrip(b' ')
    return decrypted_message

def main():
    key, iv = generate_key_iv()
    print("\nPrivate key: ", key)
    print("iv: ", iv)
    
    original_message = b'Apoorv Yadav 20BCY10130'
    print("\nOrigninal message: ", original_message)

    encrypted_message = encrypt_message(original_message, key, iv)
    print("\nEncrypted_message = ", encrypted_message)
    print("Hex of encrypted_message = ", encrypted_message.hex())

    decrypted_message = decrypt_message(encrypted_message, key, iv)
    print("\nDecrypted_message", decrypted_message)

    print("\noriginal_message == decrypted_message: ", original_message == decrypted_message)

if __name__ == '__main__':
    main()