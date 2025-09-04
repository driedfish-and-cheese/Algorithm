def solution(cap, n, deliveries, pickups):
    pick = 0
    deliv = 0
    answer = 0

    for i in range(n-1, -1, -1):
        pick += pickups[i]
        deliv += deliveries[i]

        while pick > 0 or deliv >0:
            pick -= cap
            deliv -= cap
            answer += i+1

    return 2 * answer