#include<stdio.h>
#include<string.h>
#include<ctype.h>
#define MAXSIZE 100
int stack[MAXSIZE];
int top = -1;
int pop(){
	return stack[top--];
}
void push(int n){
	stack[++top]=n;
}
int results(int a,int b,char operator){
	switch(operator){
		case '+':return a+b;
		case '-':return a-b;
		case '*':return a*b;
		case '/':return a/b;
	}
}
int postfixeval(char *str){
	int i;
	int a,b;
	for(i=0;i<strlen(str);i++){
		if(isdigit(str[i])){
			push(str[i] - '0');
		}
		else {
			b=pop();
			a=pop();
			push(results(a,b,str[i]));
		}
	}
	return pop();
}
int main(){
	char PostFixExpression[] = "6324+-*";
	printf("Expression:\n%s",PostFixExpression);
	printf("\nResults:\n%d",postfixeval(PostFixExpression));
}