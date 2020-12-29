import polyglot;

@polyglot.export_value
def complement(sequence):
    arraysequence = list(sequence)
    size = len(arraysequence)
    arraycomplementsq = [" "] * size
    npos = 0
    complementsq = ''

    for s in arraysequence:
        if s == 'A':
            arraycomplementsq[npos] = 'T'
        elif s == 'T':
            arraycomplementsq[npos] = 'A'
        elif s == 'G':
            arraycomplementsq[npos] = 'C'
        elif s == 'C':
            arraycomplementsq[npos] = 'G'
        npos = npos + 1
    
    complementsq = ''.join(arraycomplementsq)
    return complementsq

# TESTING
#print(complement("AGTACACTGGT") == 'TCATGTGACCA')