#include <iostream>
using namespace std;
char a[3][3]={'1','2','3','4','5','6','7','8','9'};
class A
{
int i,j;
public:
void board()
{
cout<<"\n\n\t*******Game For BILAL KHAN AYAN MIRZ A IS READY***********";
cout<<"\n\n\t*************Tic Tac Toe******************\n\n";
cout<<"Player 1 (X) - Player (0)"<<endl<<endl;
cout<<endl<<"\t"<<"  "<<a[0][0]<<" | "<<a[0][1]<<" | "<<a[0][2]<<endl;
cout<<endl<<"\t"<<"  "<<a[1][0]<<" | "<<a[1][1]<<" | "<<a[1][2]<<endl;
cout<<endl<<"\t"<<"  "<<a[2][0]<<" | "<<a[2][1]<<" | "<<a[2][2]<<endl;
}
int win()
{
if(a[0][0]==a[0][1] && a[0][1]==a[0][2])
return 1;
else if(a[1][0]==a[1][1] && a[1][1]==a[1][2])
return 1;
else if(a[2][0]==a[2][1] && a[2][1]==a[2][2])
return 1;
else if(a[0][0]==a[1][0] && a[1][0]==a[2][0])
return 1;
else if(a[0][1]==a[1][1] && a[1][1]==a[2][1])
return 1;
else if(a[0][2]==a[1][2] && a[1][2]==a[2][2])
return 1;
else if(a[0][0]==a[1][1] && a[1][1]==a[2][2])
return 1;
else if(a[0][2]==a[1][1] && a[1][1]==a[2][0])
return 1;
else
return -1;
}
}s1;

int main()
{
int player=1,b;
char mark,choice;
do
{
s1.board();
player=(player%2)?1:2;
cout<<endl<<"Player"<<player<<"Enter a Number";
cin>>choice;
mark=(player==1)?'X':'O';
if(a[0][0]=='1' && choice=='1')
a[0][0]=mark;
else if(a[0][1]=='2' && choice=='2')
a[0][1]=mark;
else if(a[0][2]=='3' && choice=='3')
a[0][2]=mark;
else if(a[1][0]=='4' && choice=='4')
a[1][0]=mark;
else if(a[1][1]=='5' && choice=='5')
a[1][1]=mark;
else if(a[1][2]=='6' && choice=='6')
a[1][2]=mark;
else if(a[2][0]=='7' && choice=='7')
a[2][0]=mark;
else if(a[2][1]=='8' && choice=='8')
a[2][1]=mark;
else if(a[2][2]=='9' && choice=='9')
a[2][2]=mark;
else
{
cout<<"Invalid Option";
player--;
};
b=s1.win();
player++;
}while(b==-1);
(b==1)?cout<<"Player"<<--player<<"Wins":cout<<"Game Draw";
return 0;
}
