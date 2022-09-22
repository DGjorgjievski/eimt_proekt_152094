import React from "react";
import {
  CardContent,
  Card,
  CardActionArea,
  CardMedia,
  Typography,
  Button,
} from "@mui/material";
import { Box, createStyles, makeStyles } from "@material-ui/core";

interface ICard {
  LocalName: string;
  dateTime: string;
  id: number;
}

const useStyles = makeStyles(() =>
  createStyles({
    tableItemContainer: {
      width: "100%",
      border: "0.5px solid #d3d3d3",
      boxShadow: "2px 2px 4px #d3d3d3",
      marginBottom: "10px",
      display: "flex",
      flexDirection: "row",
      justifyContent: "flex-start",
      flexGrow: 1,
    },
    imageContainer: {
      height: "auto",
      maxWidth: "300px",
      width: "100%",
    },
    tableItemContent: {
      flexGrow: 2,
      padding: "20px",
      borderRight: "1px solid blue",
    },
  })
);

export const ReservationItem = (props: ICard) => {
  const classes = useStyles();

  return (
    <Box className={classes.tableItemContainer}>
      <Box className={classes.tableItemContent}>
        <Typography gutterBottom variant="h5" component="div">
          {props.LocalName}
        </Typography>
        <Typography variant="body2" color="textSecondary">
          {props.dateTime}
        </Typography>
      </Box>
      <Button
        size="small"
        color="warning"
        onClick={() => {
          console.log(props.id);
          //Send POST to BE TO UPDATE RESERVATION
        }}
      >
        Cancle Reservation
      </Button>
      <Button
        size="small"
        color="primary"
        onClick={() => {
          console.log(props.id);
          //Send POST to BE TO UPDATE RESERVATION
        }}
      >
        Confirm Reservation
      </Button>
    </Box>
  );
};
