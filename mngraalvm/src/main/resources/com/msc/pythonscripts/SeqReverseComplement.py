import polyglot;

@polyglot.export_value
def reverse_complement(sequence):
    arraysequence = list(sequence)
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