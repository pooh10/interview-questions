class LRUCache:
    def __init__(self, capacity):
        self.capacity = capacity
        self.cache = []
        self.lru = {}

    def refer(self, key):
        # not present in cache
        if key not in self.lru:
            # If cache is full, remove the least recently used item
            if len(self.cache) == self.capacity:
                # Remove from both cache and lru dictionary
                del self.lru[self.cache[-1]]
                self.cache.pop(-1)
            
        # present in cache
        else:
            # Get the index of the key in cache
            index = self.lru[key]
            
            # update reference by removing
            self.cache.pop(index)
        
        # Add to front (most recently used position)
        self.cache.insert(0, key)
        
        # Update indices in lru dictionary
        self.lru = {}
        for i, k in enumerate(self.cache):
            self.lru[k] = i

    def display(self):
        for i in self.cache:
            print(i,end=' ')
        print('')
