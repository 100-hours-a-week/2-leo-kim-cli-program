# <h1> 9x년대생의 민속놀이 스타크래프트 게임 </h1>

<h2>개요</h2>
어렸을 적 즐겨했던 스타크래프트 게임의 추억을 회상하며 원작을 최대한 고증해보려고 하였습니다.

<h2>클래스 다이어그램</h2>

![클래스 다이어그램](KakaoTalk_Photo_2025-02-02-22-14-32.jpeg)
위에 그림에는 포함되어 있지 않지만
<br/>
TerranUnit을 상속받는 Marine, Vulture, Tank
<br/>
ZergUnit을 상속받는 Zergling, Hydralisk, Mutalisk
<br/>
ProtossUnit을 상속받는 Zealot, Dragoon, Reaver
<br/>
등이 있습니다.

Terran은 30% 미만의 체력을 가질 시에 불타서 체력이 깎이는 기능과 수리기능
<br/>
Zerg는 체력이 자동으로 차는 기능
<br/>
Protoss는 체력 외에 실드가 존재하며 실드가 자동으로 차는 기능이 있습니다.
<br/>

주요 기능
1. 닉네임 & 종족 선택<br/>
![게임 시작](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%80%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%B7_%E1%84%89%E1%85%B5%E1%84%8C%E1%85%A1%E1%86%A8.png)<br/>
![게임 화면](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%80%E1%85%A6%E1%84%8B%E1%85%B5%E1%86%B7_%E1%84%92%E1%85%AA%E1%84%86%E1%85%A7%E1%86%AB.png)<br/>
2. 자원 현황보기<br/>
![자원 상황 보기](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%8C%E1%85%A1%E1%84%8B%E1%85%AF%E1%86%AB_%E1%84%89%E1%85%A1%E1%86%BC%E1%84%92%E1%85%AA%E1%86%BC.png)<br/>
3. 미네랄 일꾼 뽑기<br/>
![미네랄 일꾼 뽑기](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%86%E1%85%B5%E1%84%82%E1%85%A6%E1%84%85%E1%85%A1%E1%86%AF_%E1%84%8E%E1%85%A2%E1%84%8E%E1%85%B1%E1%84%8B%E1%85%B2%E1%86%AF.png)<br/>
4. 가스 일꾼 뽑기<br/>
![가스 일꾼 뽑기](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%80%E1%85%A1%E1%84%89%E1%85%B3_%E1%84%8E%E1%85%A2%E1%84%8E%E1%85%B1%E1%84%8B%E1%85%B2%E1%86%AF.png)<br/>
5. 최대 인구수 뚫기<br/>
![최대 인구수 증가](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%8E%E1%85%AC%E1%84%83%E1%85%A2_%E1%84%8B%E1%85%B5%E1%86%AB%E1%84%80%E1%85%AE%E1%84%89%E1%85%AE_%E1%84%8C%E1%85%B3%E1%86%BC%E1%84%80%E1%85%A1.png)<br/>
6. 유닛 뽑기<br/>
![유닛 생성](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%8B%E1%85%B2%E1%84%82%E1%85%B5%E1%86%BA_%E1%84%89%E1%85%A2%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC.png)<br/>
![유닛 생성 불가](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%8B%E1%85%B2%E1%84%82%E1%85%B5%E1%86%BA_%E1%84%89%E1%85%A2%E1%86%BC%E1%84%89%E1%85%A5%E1%86%BC2.png)<br/>
7. 유닛 목록 보기<br/>
![유닛 목록](https://github.com/100-hours-a-week/2-leo-kim-cli-program/blob/main/%E1%84%8B%E1%85%B2%E1%84%82%E1%85%B5%E1%86%BA_%E1%84%86%E1%85%A9%E1%86%A8%E1%84%85%E1%85%A9%E1%86%A8_%E1%84%87%E1%85%A9%E1%84%80%E1%85%B5.png)<br/>

  

자원 채집과 특수능력은 5초마다 자동 발동됩니다.

<미구현 기능>
1. 각 유닛의 특수기능(마린 스팀팩, 저글링 버로우 등등)
2. 각 유닛의 특성(공중여부, 공격형태(진동형,폭발형,일반형), 대공능력, 유닛 크기(소,중,대형))
3. 공격 기능
4. 승리 조건을 반영
<br/>
<br/>
<br/>
<회고>
<br/>
1. 매번 반복되는 코드(marine, vulture 등 생성하기)를 짜는데 복붙을 했다. 하지만 추후에 코드를 수정하기에 복붙한 모든 부분들을 다 고쳐야하는 번거로움이 있었다. 이에 대해 찾아보니, Factory Pattern을 적용시키면 더 간결하고 유지보수에 좋게 코드를 짤 수 있다는 걸 알게 되었다.(적용은 하지 않았지만 추후에 적용을 해봐야겠다.)<br/>
2. Github를 설정하는데 애를 많이 먹었다.(특히 인증하는 부분.) 그동안 Github 및 Git 사용법에 대해 제대로 알고 있지 않았구나 하는것을 깨닫고, 더 부딪히며 알아가야겠다.<br/>
3. 미리미리 과제를 해야겠다고 마음만 먹고 미리미리 하지 않은것이 아쉽다. 32년 인생에서 항상 일을 미뤄버릇했고, 그 결과가 지금 나이에도 미취업자인 것임을 가슴 깊이 각인해야한다.<br/>
4. 마크 다운 문법 아직 어렵다..

