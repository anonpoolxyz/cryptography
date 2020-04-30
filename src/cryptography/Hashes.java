package cryptography;

import cryptography.hashes.adler.Adler;
import cryptography.hashes.crc.CRC;
import cryptography.hashes.elf.ELF;
import cryptography.hashes.fcs.FCS;
import cryptography.hashes.has.HAS;
import cryptography.hashes.md.MD;
import cryptography.hashes.ripemd.RIPEMD;
import cryptography.hashes.sha.SHA;
import cryptography.hashes.sha2.SHA2;
import cryptography.hashes.sha3.SHA3;
import cryptography.hashes.sum.SUM;
import cryptography.hashes.tiger.Tiger;
import cryptography.hashes.whirlpool.Whirlpool;
import cryptography.hashes.xor.Xor;

public class Hashes {

	public static void main(String[] args) {

		// CRC-8
		System.out.println("CRC-8 hash: " + CRC.crc8("test"));

		// CRC-16
		System.out.println("CRC-16 hash: " + CRC.crc16("test"));

		// CRC-24
		System.out.println("CRC-24 hash: " + CRC.crc24("test"));

		// CRC-32
		System.out.println("CRC-32 hash: " + CRC.crc32("test"));

		// CRC-64
		System.out.println("CRC-64 hash: " + CRC.crc64("testing"));

		// MD-2
		System.out.println("MD-2 hash: " + MD.md2("testing"));

		// MD-4
		System.out.println("MD-4 hash: " + MD.md4("testing"));

		// MD-5
		System.out.println("MD-5 hash: " + MD.md5("testing"));

		// RIPEMD-128
		System.out.println("RIPEMD-128 hash: " + RIPEMD.ripemd128("testing"));

		// RIPEMD-160
		System.out.println("RIPEMD-160 hash: " + RIPEMD.ripemd160("testing"));

		// RIPEMD-256
		System.out.println("RIPEMD-256 hash: " + RIPEMD.ripemd256("testing"));

		// RIPEMD-320
		System.out.println("RIPEMD-320 hash: " + RIPEMD.ripemd320("testing"));

		// SHA-0
		System.out.println("SHA-0 hash: " + SHA.sha0("testing"));

		// SHA-1
		System.out.println("SHA-1 hash: " + SHA.sha1("testing"));

		// SHA-224
		System.out.println("SHA-224 hash: " + SHA.sha224("testing"));

		// SHA-256
		System.out.println("SHA-256 hash: " + SHA.sha256("testing"));

		// SHA-384
		System.out.println("SHA-384 hash: " + SHA.sha384("testing"));

		// SHA-512
		System.out.println("SHA-512 hash: " + SHA.sha512("testing"));

		// Tiger
		System.out.println("Tiger hash: " + Tiger.tiger("testing"));

		// Tiger2
		System.out.println("Tiger2 hash: " + Tiger.tiger2("testing"));

		// Tiger-128
		System.out.println("Tiger-128 hash: " + Tiger.tiger128("testing"));

		// Tiger-160
		System.out.println("Tiger-160 hash: " + Tiger.tiger160("testing"));

		// Whirlpool-0
		System.out.println("Whirlpool-0 hash: " + Whirlpool.whirlpool0("testing"));

		// Whirlpool-1
		System.out.println("Whirlpool-1 hash: " + Whirlpool.whirlpool1("testing"));

		// Whirlpool
		System.out.println("Whirlpool hash: " + Whirlpool.whirlpool("testing"));

		// Adler-32
		System.out.println("Adler-32 hash: " + Adler.adler32("testing"));

		// ELF-32
		System.out.println("ELF-32 hash: " + ELF.elf32("testing"));

		// FCS-16
		System.out.println("FCS-16 hash: " + FCS.fcs16("testing"));

		// Has-160
		System.out.println("HAS-160 hash: " + HAS.has160("testing"));

		// SUM-8
		System.out.println("SUM-8 hash: " + SUM.sum8("testing"));

		// SUM-16
		System.out.println("SUM-16 hash: " + SUM.sum16("testing"));

		// SUM-24
		System.out.println("SUM-24 hash: " + SUM.sum24("testing"));

		// SUM-32
		System.out.println("SUM-32 hash: " + SUM.sum32("testing"));

		// XOR-8
		System.out.println("XOR-8 hash: " + Xor.xor8("testing"));

		// SHA2-224
		System.out.println("SHA2-224 hash: " + SHA2.sha2_224("testing"));

		// SHA2-256
		System.out.println("SHA2-256 hash: " + SHA2.sha2_256("testing"));

		// SHA2-384
		System.out.println("SHA2-384 hash: " + SHA2.sha2_384("testing"));

		// SHA2-512
		System.out.println("SHA2-512 hash: " + SHA2.sha2_512("testing"));

		// SHA3-224
		System.out.println("SHA3-224 hash: " + SHA3.sha3_224("testing"));

		// SHA3-256
		System.out.println("SHA3-256 hash: " + SHA3.sha3_256("testing"));

		// SHA3-384
		System.out.println("SHA3-384 hash: " + SHA3.sha3_384("testing"));

		// SHA3-512
		System.out.println("SHA3-512 hash: " + SHA3.sha3_512("testing"));

	}

}
