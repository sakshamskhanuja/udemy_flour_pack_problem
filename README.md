## Number To Words

### Description

Write a method named <b>canPack</b> with three parameters of type <b>int</b> named <b>bigCount</b>, <b>smallCount</b>, and <b>goal</b>. The parameter <b>bigCount</b> represents the count of big flour bags (5 kilos each). The parameter <b>smallCount</b> represents the count of small flour bags (1 kilo each). The parameter <b>goal</b> represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of <b>bigCount</b> and <b>smallCount</b> must be at least equal to the value of <b>goal</b>. The method should return <b>true</b> if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. If any of the parameters are negative, return false. 

### Examples of input/output

<ul>
<li>canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.</li>
<li>canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.</li>
<li>canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.</li>
<li>canPack (2, 2, 11); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.</li>
<li>canPack (-3, 2, 12); should return false since bigCount is negative.</li>
</ul>
