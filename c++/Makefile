TARGET=$(CURDIR)/target

dummy:=$(shell mkdir -p $(TARGET))

.DEFAULT: all

.PHONY: all clean

all: test.cpp
	$(CXX) $(CXXFLAGS) -o $(TARGET)/lru_cpp test.cpp

clean:
	-rm -rf target