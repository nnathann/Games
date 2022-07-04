class OutputGrid:

  columnmap = {
    "0": "A",
    "1": "B",
    "2": "C",
    "3": "D",
    "4": "E"
  }
  column = 0
  row = 0
  while column < 5:
    row = 0
    while row < 5:
      dictkey = columnmap[str(column)] + str(row+1)
      print(grid[dictkey], end=" ")
      row += 1
    print("")
    column += 1
