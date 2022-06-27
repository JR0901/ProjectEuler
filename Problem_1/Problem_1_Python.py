total = 0
for i in range (1000):
    if (i%3 == 0) or (i%5 == 0):
        total += i
print(total)

# int total = 0; 
#         for (int i=1; i<1000; ++i) { 
#             if (i%3 == 0 || i%5 == 0) { 
#                 total += i; 
#             } 
#         }