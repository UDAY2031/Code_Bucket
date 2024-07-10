#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <time.h>

#define BUCKET_SIZE 10
#define OUTPUT_RATE 1
#define MAX_PACKETS 100

int main() {
    int packets_in_bucket = 0;
    int total_packets = 0;
    int dropped_packets = 0;
    srand(time(NULL));

    printf("Simulating Leaky Bucket Algorithm\n");
    printf("Bucket Size: %d, Output Rate: %d packet/s\n\n", BUCKET_SIZE, OUTPUT_RATE);

    while (total_packets < MAX_PACKETS) {
        int incoming_packets = rand() % 5;  // 0 to 4 packets arrive randomly
        total_packets += incoming_packets;

        printf("Time %d: %d packet(s) arrived\n", total_packets, incoming_packets);

        if (incoming_packets + packets_in_bucket > BUCKET_SIZE) {
            dropped_packets += (incoming_packets + packets_in_bucket - BUCKET_SIZE);
            packets_in_bucket = BUCKET_SIZE;
            printf("Bucket overflow! Dropped %d packet(s)\n", 
                   incoming_packets + packets_in_bucket - BUCKET_SIZE);
        } else {
            packets_in_bucket += incoming_packets;
        }

        if (packets_in_bucket > 0) {
            packets_in_bucket -= OUTPUT_RATE;
            printf("1 packet sent\n");
        } else {
            printf("No packets to send\n");
        }

        printf("Packets in bucket: %d\n\n", packets_in_bucket);
        sleep(1);  // Wait for 1 second
    }

    printf("Simulation ended\n");
    printf("Total packets: %d\n", total_packets);
    printf("Dropped packets: %d\n", dropped_packets);
    printf("Packet drop rate: %.2f%%\n", (float)dropped_packets / total_packets * 100);

    return 0;
}
