int printCount(int c)
  {
  System.out.print(c);
  if(c==0)
{
  return ;
}
printCount(c-1);

  }
