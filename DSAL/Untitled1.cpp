#include <iostream>
using namespace std;

int main(void)
{
  int n,q;
  int ar[100000]={0};
  int que[100000][3];
  
  cin >> n;
  cin >>q;
  
  for(int i=0;i<q;i++)
  {
  	for(int j=0;j<3;j++)
  	{
  		cin >> que[i][j];	
	}
  }
  
  for(int i=0;i<q;i++)
  {
  	for(int j=1;j<=n;j++)
  	{
  		if(j>=que[i][0] && j<=que[i][1])
  		{
  			ar[j-1]=ar[j-1] + que[i][2];	
		}
	}
  }
  int max=0;
  for(int i=0;i<n;i++)
  {
  	if(max<ar[i])
  	{
  		max=ar[i];
	  }
  }

	cout << max;

  
  
  
  
  return 0;
}

