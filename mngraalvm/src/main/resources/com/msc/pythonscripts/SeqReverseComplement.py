# AUTHOR : José Antonio Romero Ventura

import polyglot;

@polyglot.export_value
def reverse_complement(sequence):
    sequencenobreaks = sequence.replace("\n","")
    sequenceUpper = sequencenobreaks.upper()
    arraysequence = list(sequenceUpper)
    size = len(arraysequence)
    arrayrevcomplementsq = [" "] * size
    npos = size - 1
    revcomplementsq = ''

    for s in arraysequence:
        if s == 'A':
            arrayrevcomplementsq[npos] = 'T'
        elif s == 'T':
            arrayrevcomplementsq[npos] = 'A'
        elif s == 'G':
            arrayrevcomplementsq[npos] = 'C'
        elif s == 'C':
            arrayrevcomplementsq[npos] = 'G'
        npos = npos - 1
    
    revcomplementsq = ''.join(arrayrevcomplementsq)
    return revcomplementsq

# TESTING
#print(reverse_complement("AGTACACTGGT") == 'ACCAGTGTACT')