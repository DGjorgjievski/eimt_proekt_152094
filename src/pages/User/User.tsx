import React from "react";
import { Box, createStyles, makeStyles, Typography } from "@material-ui/core";
import { userData } from "./User.data";
import { ReservationItem } from "../../components/ReservationItem/ReservationItem";

const useStyles = makeStyles(() =>
  createStyles({
    aboutContainer: {
      maxWidth: "90vw",
      margin: "0 auto",
      display: "flex",
      flexDirection: "column",
    },
    contentContainer: {
      marginTop: "40px",
    },
  })
);

export const User = () => {
  const classes = useStyles();
  return (
    <Box className={classes.aboutContainer}>
      <Box>
        <Typography variant="h5">User Name</Typography>
        <Typography variant="h6">User points</Typography>
      </Box>
      <Box>
        {userData.map((userReservation: any) => (
          <ReservationItem
            LocalName={userReservation.localName}
            dateTime={userReservation.dateTime}
            id={userReservation.id}
          ></ReservationItem>
        ))}
      </Box>
    </Box>
  );
};
