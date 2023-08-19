class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0; // 시작지점
        int curTank = 0; // 현재보유가스
        int allTank = 0; // 가스변동 총량
        for(int i = 0; i < gas.length; i++){
            int curGain = gas[i] - cost[i]; // 충전가스 - 비용가스 = 현시점 가스변동량
            allTank += curGain; // 가스변동량 업데이트
            if(curTank + curGain < 0){
                index = i + 1; // 시작지점 다음으로 변경
                curTank = 0; // 현재보유가스 초기화
            }
            else
                curTank += curGain; // 현재보유가스 업데이트
        }
        if(allTank < 0)
            return -1; // 가스변동 총량이 0이하면 이동불가 (why? 변동량은 비용을 낸뒤에 충전을 하기 때문에)
        else
            return index;
    }
}