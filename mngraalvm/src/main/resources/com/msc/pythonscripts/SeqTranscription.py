# files
# dna example
# AUTHOR : Dr. Adolfo Centeno Tellez
# CO-AUTHOR : José Antonio Romero Ventura

import polyglot;

nucleotides = ["A", "C", "T", "G"]

nucl_complement = {
        "A":"T",
        "C":"G",
        "T":"A",
        "G":"C"
    }

rna_transcription = {
        "A":"A",
        "C":"C",
        "T":"U",
        "G":"G"
    }

codons = {
  "UUU": "Fenilalanina",
  "UUC": "Fenilalanina",
  "UUA": "Leucina",
  "UUG": "Leucina",
  "UCU": "Serina",
  "UCC": "Serina",
  "UCA": "Serina",
  "UCG": "Serina",
  "UAU": "Tirosina",
  "UAC": "Tirosina",
  "UAA": "Codon de terminacion ocre",
  "UAG": "Codon de terminacin Ambar",
  "UGU": "Cisteina",
  "UGC": "Cisteina",
  "UGA": "Codon de terminacion Opalo",
  "UGG": "Triptofano",
  "CUU": "Leucina",
  "CUC": "Leucina",
  "CUA": "Leucina",
  "CUG": "Leucina",
  "CCU": "Prolina",
  "CCC": "Prolina",
  "CCA": "Prolina",
  "CCG": "Prolina",
  "CAU": "Histidina",
  "CAC": "Histidina",
  "CAA": "Glutamina",
  "CAG": "Glutamina",
  "CGU": "Arginina",
  "CGC": "Arginina",
  "CGA": "Arginina",
  "CGG": "Arginina",
  "AUU": "Isoleucina",
  "AUC": "Isoleucina",
  "AUA": "Isoleucina",
  "AUG": "Metionina",
  "ACU": "Treonina",
  "ACC": "Treonina",
  "ACA": "Treonina",
  "ACG": "Treonina",
  "AAU": "Asparagina",
  "AAC": "Asparagina",
  "AAA": "Lisina",
  "AAG": "Lisina",
  "AGU": "Serina",
  "AGC": "Serina",
  "AGA": "Arginina",
  "AGG": "Arginina",
  "GUU": "Valina",
  "GUC": "Valina",
  "GUA": "Valina",
  "GUG": "Valina",
  "GCU": "Alanina",
  "GCC": "Alanina",
  "GCA": "Alanina",
  "GCG": "Alanina",
  "GAU": "acido asartico",
  "GAC": "acido asartico",
  "GAA": "acido glutamico",
  "GAG": "acido glutamico",
  "GGU": "Glicina",
  "GGC": "Glicina",
  "GGA": "Glicina",
  "GGG": "Glicina"
}

aminoacidos = {
  "UUU": "F",
  "UUC": "F",
  "UUA": "L",
  "UUG": "L",
  "UCU": "S",
  "UCC": "S",
  "UCA": "S",
  "UCG": "S",
  "UAU": "Y",
  "UAC": "Y",
  "UAA": "",
  "UAG": "",
  "UGU": "C",
  "UGC": "C",
  "UGA": "",
  "UGG": "W",
  "CUU": "L",
  "CUC": "L",
  "CUA": "L",
  "CUG": "L",
  "CCU": "P",
  "CCC": "P",
  "CCA": "P",
  "CCG": "P",
  "CAU": "H",
  "CAC": "H",
  "CAA": "Q",
  "CAG": "Q",
  "CGU": "R",
  "CGC": "R",
  "CGA": "R",
  "CGG": "R",
  "AUU": "I",
  "AUC": "I",
  "AUA": "I",
  "AUG": "M",
  "ACU": "T",
  "ACC": "T",
  "ACA": "T",
  "ACG": "T",
  "AAU": "N",
  "AAC": "N",
  "AAA": "L",
  "AAG": "L",
  "AGU": "S",
  "AGC": "S",
  "AGA": "R",
  "AGG": "R",
  "GUU": "V",
  "GUC": "V",
  "GUA": "V",
  "GUG": "V",
  "GCU": "A",
  "GCC": "A",
  "GCA": "A",
  "GCG": "A",
  "GAU": "D",
  "GAC": "D",
  "GAA": "E",
  "GAG": "E",
  "GGU": "G",
  "GGC": "G",
  "GGA": "G",
  "GGG": "G"
}

@polyglot.export_value
def transcription(sequence):
 nucl_codon = []
 frames = []
 proteins = []
 values = []
 dna = ""
 dna_complement = ""
 rna = ""

 sequencenobreaks = sequence.replace("\n","")
 dna = sequencenobreaks.upper()

 # complementary seq
 for x in dna:
   dna_complement = dna_complement + nucl_complement[x]

 #getting RNA transcription
 for x in dna:
   rna = rna + rna_transcription[x]

 #getting length from RNA
 n = len(rna)

 codon = ""
 myframe = ""
 frame_start = 0

 for c in range(0, 3):
   myframe = ""
   frame_start = 0

   for i in range(c, n, 3):
     codon = rna[i:i+3]
     nucl_codon.append(codon)
     if (codon == "AUG") and (frame_start == 0):
       frame_start = 1
       myframe = "AUG"
     else:
       if (frame_start == 1):
         if (codon == "UAA") or (codon=="UAG") or (codon=="UGA"):
           frame_start = 0
           frames.append(myframe)
           myframe = ""
         else:
           myframe = myframe + codon

 n = len(frames)

 myprotein = ""
 for i in range(0,n):
   y = len(frames[i])
   myprotein = ""
   myframe = frames[i]

   for j in range(0, y, 3):
     codon = myframe[j:j+3]
     myprotein += aminoacidos[codon]
   proteins.append(myprotein)

 #Adding values in array to retrieving rna, n length, codons and proteins
 values.append(rna)
 values.append(n)
 values.append(frames)
 values.append(proteins)

 return values

# TESTING
#transcription()